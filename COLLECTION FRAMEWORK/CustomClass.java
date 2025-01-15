class Data {
    private Integer num;
    private String name;
    //storing class in this class
    private InternalData internalData;


    Data(int num, String name, int revenue){
      this.num = num;
      this.name = name;
      this.internalData = new InternalData(revenue);
    }

    public void setNum(Integer num){
        this.num=num;
    }
    public void setName(String name){
        this.name=name;
    }

    public Integer getNum(){
        return num;
    }
    public String getName(){
        return name;
    }

}
class InternalData{
    public Integer revenue;
    InternalData(Integer revenue){
        this.revenue=revenue;
    }
}
public class CustomClass {

    public static void main(String[] args) {
        // Integer num = 3;
        // String name = "Vaibhav";
        Data dataObj1 = new Data(10, "Vaibhav",100);
        Data dataObj2 = new Data(15,"Reliance",200000);
        //dataObj1.name="Alan";
        //System.out.println(dataObj1.name);
        //System.out.println(dataObj2.name);

        //using getter and setter
        dataObj2.setName("Ambani");
        System.out.println(dataObj2.getName());
  
    }
}

// we usually use getter setter then we keep fields private in our class but for DSA we can
//keep it as public to avoid setting getter setter.