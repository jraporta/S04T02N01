package cat.itacademy.s04.t02.n01.services;

import cat.itacademy.s04.t02.n01.model.Fruit;
import cat.itacademy.s04.t02.n01.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FruitService {

    @Autowired
    private FruitRepository fruitRepository;

    public Fruit createFruit(Fruit fruit){
        return fruitRepository.save(fruit);
    }

    public List<Fruit> getAllFruits(){
        return fruitRepository.findAll();
    }

    public Optional<Fruit> getFruitById(Long id){
        return fruitRepository.findById(id);
    }

    public void deleteFruitById(Long id){
        fruitRepository.deleteById(id);
    }

    public Fruit updateFruit(Fruit fruit){
        return fruitRepository.save(fruit);
    }


}
