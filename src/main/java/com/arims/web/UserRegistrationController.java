package com.arims.web;

import com.arims.model.Admin;
import com.arims.model.Artifact;
import com.arims.model.Cbo;
import com.arims.model.User;
import com.arims.service.AdminService;
import com.arims.service.ArtifactService;
import com.arims.service.CboService;
import com.arims.service.UserService;
import com.arims.web.dto.LoginDto;
import com.arims.web.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (path="api/v1/registration")
public class UserRegistrationController {


    private UserService userService;
    private final AdminService adminService;
    private final CboService cboService;

    private final ArtifactService artifactService;

    @Autowired
    private  AuthenticationManager authenticationManager;



    public UserRegistrationController(UserService userService, AdminService adminService, CboService cboService, ArtifactService artifactService) {
        super();
        this.userService = userService;
        this.adminService = adminService;
        this.cboService = cboService;
        this.artifactService = artifactService;
    }

    // Admin API

    @PostMapping("/add")
    public ResponseEntity<Admin> addEmployee(@RequestBody Admin admin) {
        Admin newAdmin = adminService.add(admin);
        return new ResponseEntity<>(newAdmin, HttpStatus.CREATED);
    }

    @DeleteMapping({"/deleteAdmin/{id}"})
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        this.adminService.deleteAdmin(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping({"/updateAdmin"})
    public ResponseEntity<Admin> updateAdmin(@RequestBody Admin admin) {
        Admin updateAdmin = this.adminService.updateAdmin(admin);
        return new ResponseEntity(updateAdmin, HttpStatus.OK);
    }

    @GetMapping({"/allAdmin"})
    public ResponseEntity<List<Admin>> getAlL() {
        List<Admin> admins = this.adminService.findAllAdmin();
        return new ResponseEntity(admins, HttpStatus.OK);
    }

    @GetMapping({"/findAdmin/{id}"})
    public ResponseEntity<Admin> getAdminById(@PathVariable("id") Long id) {
        Admin admin = this.adminService.findAdminById(id);
        return new ResponseEntity(admin, HttpStatus.OK);
    }



    //Cbo API

    @PostMapping("/cbo")
    public ResponseEntity<Cbo> addCbo(@RequestBody Cbo cbo) {
        Cbo newCbo = cboService.add1(cbo);
        return new ResponseEntity<>(newCbo, HttpStatus.CREATED);
    }

    @DeleteMapping({"/deleteCbo/{id}"})
    public ResponseEntity<?> deleteCbo(@PathVariable("id") Long id) {
        this.cboService.deleteCbo(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping({"/updateCbo"})
    public ResponseEntity<Cbo> updateAdmin(@RequestBody Cbo cbo) {
        Cbo updateCbo = this.cboService.updateCbo(cbo);
        return new ResponseEntity(updateCbo, HttpStatus.OK);
    }

    @GetMapping({"/allCbo"})
    public ResponseEntity<List<Cbo>> getAlLCbo() {
        List<Cbo> cbo = this.cboService.findAllCbo();
        return new ResponseEntity(cbo, HttpStatus.OK);
    }

    @GetMapping({"/findCbo/{id}"})
    public ResponseEntity<Cbo> getCboById(@PathVariable("id") Long id) {
        Cbo cbo = this.cboService.findCboById(id);
        return new ResponseEntity(cbo, HttpStatus.OK);
    }


    //Registration API


    @PostMapping
    public User register(@RequestBody UserRegistrationDto userRegistrationDto) {
       return userService.save(userRegistrationDto);
    }

    @PostMapping("/login")
    public LoginDto authenticateUser(@RequestBody LoginDto loginDto){
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                loginDto.getEmail(), loginDto.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        return loginDto;
        //return new ResponseEntity<>("User signed-in successfully!.", HttpStatus.OK);
    }




    @PostMapping({"/addArt"})
    public ResponseEntity<Artifact> addArtifact(@RequestBody Artifact artifact) {
        Artifact addArtifact = this.artifactService.newArt(artifact);
        return new ResponseEntity(addArtifact, HttpStatus.CREATED);
    }

    @DeleteMapping({"/deleteArt/{id}"})
    public ResponseEntity<?> deleteArt(@PathVariable("id") Long id) {
        this.artifactService.deleteArtifact(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping({"/updateArt"})
    public ResponseEntity<Artifact> updateArt(@RequestBody Artifact artifact) {
        Artifact updateArt = this.artifactService.updateArtifact(artifact);
        return new ResponseEntity(updateArt, HttpStatus.OK);
    }

    @GetMapping({"/allArt"})
    public ResponseEntity<List<Artifact>> getAlLArt() {
        List<Artifact> art = this.artifactService.findAllArtifact();
        return new ResponseEntity(art, HttpStatus.OK);
    }

    @GetMapping({"/findArtifact/{id}"})
    public ResponseEntity<Artifact> getArtById(@PathVariable("id") Long id) {
        Artifact art = this.artifactService.findArtifactById(id);
        return new ResponseEntity(art, HttpStatus.OK);
    }


}
