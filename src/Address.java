public class Address {
    private String tinh;
    private String huyen;
    private String xa;
    private int soNha;

    public Address() {
    }

    public Address(String tinh, String huyen, String xa, int soNha) {
        this.tinh = tinh;
        this.huyen = huyen;
        this.xa = xa;
        this.soNha = soNha;
    }

    public String getTinh() {
        return tinh;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    public String getHuyen() {
        return huyen;
    }

    public void setHuyen(String huyen) {
        this.huyen = huyen;
    }

    public String getXa() {
        return xa;
    }

    public void setXa(String xa) {
        this.xa = xa;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }
}
