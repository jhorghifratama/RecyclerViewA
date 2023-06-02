package com.jhorghifratama201103643.recyclerviewa;

public class NegaraModel {
    private String nama, deskripsi, url;

    public NegaraModel()
    {
    }

    public String getNama()
    {
        return nama;
    }

    public Void setNama(String nama)
    {
        this.nama = nama;
        return null;
    }

    public String getDeskripsi()
    {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi)
    {
        this.deskripsi = deskripsi;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }
}
