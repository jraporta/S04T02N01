package cat.itacademy.s04.t02.n01.controllers;

import cat.itacademy.s04.t02.n01.model.Fruit;
import cat.itacademy.s04.t02.n01.services.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/fruit")
@RestController
public class FruitController {

    @Autowired
    FruitService fruitService;

    @ResponseBody
    @PostMapping("/add")
    public Fruit addFruit(@RequestBody Fruit fruit){
        return fruitService.createFruit(fruit);
    }

    @PutMapping("/update")
    public Fruit updateFruit(@RequestBody Fruit fruit){
        return fruitService.updateFruit(fruit);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFruit(@PathVariable Long id){
        fruitService.deleteFruitById(id);
    }

    @GetMapping("/getOne/{id}")
    public Fruit getFruit(@PathVariable Long id){
        return fruitService.getFruitById(id).orElse(null);
    }

    @ResponseBody
    @GetMapping("/getAll")
    public List<Fruit> getAllFruits(){
        return fruitService.getAllFruits();
    }

}
