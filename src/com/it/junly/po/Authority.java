package com.it.junly.po;

import java.util.List;

public class Authority {
    private Long id;

    private String dataUrl;

    private String menuClass;

    private String menuCode;

    private String menuName;

    private String parentMenucode;

    private Long sequence;
    
    private List<Authority> childMenucodes;
    
    public List<Authority> getChildMenucodes() {
		return childMenucodes;
	}

	public void setChildMenucodes(List<Authority> childMenucodes) {
		this.childMenucodes = childMenucodes;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataUrl() {
        return dataUrl;
    }

    public void setDataUrl(String dataUrl) {
        this.dataUrl = dataUrl == null ? null : dataUrl.trim();
    }

    public String getMenuClass() {
        return menuClass;
    }

    public void setMenuClass(String menuClass) {
        this.menuClass = menuClass == null ? null : menuClass.trim();
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode == null ? null : menuCode.trim();
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getParentMenucode() {
        return parentMenucode;
    }

    public void setParentMenucode(String parentMenucode) {
        this.parentMenucode = parentMenucode == null ? null : parentMenucode.trim();
    }

    public Long getSequence() {
        return sequence;
    }

    public void setSequence(Long sequence) {
        this.sequence = sequence;
    }
}