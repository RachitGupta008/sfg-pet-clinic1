package guru.springframework.petclinic.services.map;

import guru.springframework.petclinic.model.BaseEntity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    T findById(ID id){
        return map.get(id);
    }

    Set<T> findAll(){
    return new HashSet<>(map.values());
    }

    T save( T object) {

        if (object != null) {
            if (object.getId() == null) {
                object.setId(generateId());
            }


        map.put(object.getId(), object);
    }else{
            throw new RuntimeException("Object is null");
        }
        return object;
    }

    void delete( T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    void deleteById(ID id){
        map.remove(id);
    }

    private Long generateId(){

        return Long.valueOf(map.size()+1);

    }

}
