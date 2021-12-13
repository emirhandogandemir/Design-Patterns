package StructuralPattern.composite.compositeexample3;

import java.util.ArrayList;
import java.util.List;

class CompositeDealers extends Worker{

    List<Worker> workerList= new ArrayList<>();

    @Override
    public int getCost() {
         int result=0;
        for (Worker worker : workerList){
          result += worker.getCost();
        }
        return result;
    }

    public void add(Worker worker){
        workerList.add(worker);
    }

}
