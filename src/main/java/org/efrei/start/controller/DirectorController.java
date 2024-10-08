package org.efrei.start.controller;

import org.efrei.start.model.Director;
import org.efrei.start.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/directors")
public class DirectorController {

    @Autowired
    private DirectorService directorService;

    @GetMapping
    public List<Director> getAllDirectors() {
        return directorService.getAllDirectors();
    }

    @GetMapping("/{id}")
    public Director getDirectorById(@PathVariable Long id) {
        return directorService.getDirectorById(id);
    }

    @PostMapping
    public Director createDirector(@RequestBody Director director) {
        return directorService.saveDirector(director);
    }

    @PutMapping("/{id}")
    public Director updateDirector(@PathVariable Long id, @RequestBody Director directorDetails) {
        Director director = directorService.getDirectorById(id);
        if (director != null) {
            director.setName(directorDetails.getName());
            director.setMovies(directorDetails.getMovies());
            return directorService.saveDirector(director);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteDirector(@PathVariable Long id) {
        directorService.deleteDirector(id);
    }
}
