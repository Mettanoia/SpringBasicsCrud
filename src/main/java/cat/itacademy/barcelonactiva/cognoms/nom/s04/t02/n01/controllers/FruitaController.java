package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.controllers;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.domain.Fruita;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.naming.OperationNotSupportedException;

@Controller
@RequestMapping("/fruita")
final class FruitaController {

    @PostMapping("/add")
    String add(Fruita fruita) {
        throw new IllegalStateException("Not yet implemented");
    }

    @PostMapping("/update/")
    String update(Fruita fruita) {
        throw new IllegalStateException("Not yet implemented");
    }

    @DeleteMapping("/delete/{id}")
    String delete(@PathVariable int id) {
        throw new IllegalStateException("Not yet implemented");
    }

    @GetMapping("/getAll")
    String getAll() {
        throw new IllegalStateException("Not yet implemented");
    }

    @GetMapping("/get/{id}")
    String getOne(@PathVariable int id) {
        throw new IllegalStateException("Not yet implemented");
    }

}
