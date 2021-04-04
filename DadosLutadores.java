package Aula7e8;
public class DadosLutadores {
    private String name;
    private String nationality;
    private int age;
    private float height;
    private float weight;
    private String category;
    private int victories;
    private int defeats;
    private int ties;

public DadosLutadores(String name, String nationality, int age, float height, float weight, int victories, int defeats, int ties){
    this.name = name;
    this.nationality = nationality;
    this.age = age;
    this.height = height;
    this.setWeight(weight);
    this.victories = victories;
    this.defeats = defeats;
    this.ties = ties;

}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
        this.setCategory();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory() {
        if(this.weight < 52.2){
            this.category = "Invalido";
        }
        else if(this.weight <= 70.3){
            this.category = "Leve";
        }
        else if(this.weight <= 83.9){
            this.category = "Médio";
        }
        else if(this.weight <= 120.2){
            this.category = "Pesado";
        }
        else{
            this.category = "INVALIDO";
        }
    }

    public int getVictories() {
        return victories;
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }

    public int getDefeats() {
        return defeats;
    }

    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }

    public int getTies() {
        return ties;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }

    public void apresentar(){
        System.out.println("Lutador" + this.getName());
        System.out.println("Origem" + this.getNationality());
        System.out.println(this.getAge() + "anos");
        System.out.println(this.getHeight() + "m de altura");
        System.out.println("Pesando" + this.getWeight() + "Kg");
        System.out.println("Ganhou" + this.getVictories());
        System.out.println("Perdeu" + this.getDefeats());
        System.out.println("Empatou" + this.getTies());
    }

    public void status(){
        System.out.printf(this.getName());
        System.out.println("é um peso" + this.getCategory());
        System.out.println(this.getVictories() + "vitórias");
        System.out.println(this.getDefeats() + "derrotas");
        System.out.println(this.getTies() + "empates");
    }

    public void ganharLuta(){
        this.setVictories(getVictories() + 1);
    }

    public void perderLuta(){
        this.setDefeats(this.getDefeats() + 1);
    }
    public void empatarLuta(){
        this.setTies(this.getTies() + 1);
    }
}
