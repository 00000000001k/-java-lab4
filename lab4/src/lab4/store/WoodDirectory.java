package lab4.store;

import lab4.model.Wood;

public class WoodDirectory extends AbstractStore{

    public Wood get(int id){
        for (int i = 0; i < count; i++) {
            Wood wood = (Wood) arr[i];
            if(wood.getId()==id)
                return wood;
        }
        return null;
    }

    public boolean add(Wood newWood){
        //Перевірка на унікальність id
        if(get(newWood.getId())!=null)
            return false;
        super.add(newWood);
        return  true;
    }

    public  String toString(){
        StringBuilder sb = new StringBuilder("Каталог деревини:\n");
        sb.append(super.toString());
        return  sb.toString();
    }
}
