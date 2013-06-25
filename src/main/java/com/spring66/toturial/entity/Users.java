/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring66.toturial.entity;

import java.util.Date;

/**
 *
 * @author Phongsak
 */
public class Users {
    private String usrId;
    private String usrName;
    private String usrPwd;
    private Integer usrLevel;
    private Date usrFirstLogin;
    private Date regDate;
    private Date logDate;

    /**
     * @return the usrId
     */
    public String getUsrId() {
        return usrId;
    }

    /**
     * @param usrId the usrId to set
     */
    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    /**
     * @return the usrName
     */
    public String getUsrName() {
        return usrName;
    }

    /**
     * @param usrName the usrName to set
     */
    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    /**
     * @return the usrPwd
     */
    public String getUsrPwd() {
        return usrPwd;
    }

    /**
     * @param usrPwd the usrPwd to set
     */
    public void setUsrPwd(String usrPwd) {
        this.usrPwd = usrPwd;
    }

    /**
     * @return the usrLevel
     */
    public Integer getUsrLevel() {
        return usrLevel;
    }

    /**
     * @param usrLevel the usrLevel to set
     */
    public void setUsrLevel(Integer usrLevel) {
        this.usrLevel = usrLevel;
    }

    /**
     * @return the usrFirstLogin
     */
    public Date getUsrFirstLogin() {
        return usrFirstLogin;
    }

    /**
     * @param usrFirstLogin the usrFirstLogin to set
     */
    public void setUsrFirstLogin(Date usrFirstLogin) {
        this.usrFirstLogin = usrFirstLogin;
    }

    /**
     * @return the regDate
     */
    public Date getRegDate() {
        return regDate;
    }

    /**
     * @param regDate the regDate to set
     */
    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    /**
     * @return the logDate
     */
    public Date getLogDate() {
        return logDate;
    }

    /**
     * @param logDate the logDate to set
     */
    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }
}
