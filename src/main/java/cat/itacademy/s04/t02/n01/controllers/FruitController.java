package cat.itacademy.s04.t02.n01.controllers;

import cat.itacademy.s04.t02.n01.model.Fruit;
import cat.itacademy.s04.t02.n01.services.FruitService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/fruit")
@RestController
public class FruitController {

    private final FruitService fruitService;

    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @ResponseBody
    @PostMapping("/add")
    public ResponseEntity<String> addFruit(@Valid @RequestBody Fruit fruit){
        Fruit addedFruit = fruitService.addFruit(fruit);
        return ResponseEntity.ok("Added fruit with id " + addedFruit.getId());
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateFruit(@Valid @RequestBody Fruit fruit){
        Fruit updatedFruit = fruitService.updateFruit(fruit);
        return ResponseEntity.ok("Updated fruit with id " + updatedFruit.getId());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteFruit(@PathVariable Long id){
        fruitService.deleteFruitById(id);
        return ResponseEntity.ok("Deleted fruit with id " + id);
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<Fruit> getFruit(@PathVariable Long id){
        return ResponseEntity.ok(fruitService.getFruitById(id));
    }

    @ResponseBody
    @GetMapping("/getAll")
    public ResponseEntity<List<Fruit>> getAllFruits(){
        return ResponseEntity.ok(fruitService.getAllFruits());
    }

}
