package exercises1;

public class Phone {
    private double weight;
    private String model;
    private int number;

    public Phone(int number, String model, double weight) {
        this(number, model); //вызов конструктора с 2 параметрами
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public int getNumber() {
        return number;
    }

    public double getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + " номет " + number);
    }

    public void sendMessage(int ...t){
        for (int i =0; i<t.length;i++){
            System.out.println("Телефон "+t[i]);
        }
    }


}
