package test;

public class GetSet {
    private String name;
    private int tuoi;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public GetSet(String name, int tuoi) {
        System.out.println("Tạo đối tượng!");
        this.name = name;
        this.tuoi = tuoi;
    }


    public GetSet(){

    }


}
