public interface OduncVerilebilir {
    void OduncVer(String uye) throws StokYetersizException;
    void iadeAl(String uye);
    boolean musaitMi();
}
