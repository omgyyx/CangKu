package cn.qziedu.wzb.po;

import java.io.Serializable;

public class Navigator implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -1744986862732273591L;

	private Integer id;

    private String name;

    private String url;

    private Short enable;
    

    public Navigator() {
		
	}

	public Navigator(Integer id, String name, String url, Short enable) {

		this.id = id;
		this.name = name;
		this.url = url;
		this.enable = enable;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Short getEnable() {
        return enable;
    }

    public void setEnable(Short enable) {
        this.enable = enable;
    }
}