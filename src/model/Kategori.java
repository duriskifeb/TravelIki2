package model;

public class Kategori {
    private int id;
    private String nama;
    
    public Kategori(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Kategori{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                '}';
    }
}
