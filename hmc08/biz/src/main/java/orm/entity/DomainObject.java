package orm.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * Author:meice Huang
 * Time: 2019-08-27 14:13
 */
@MappedSuperclass
public class DomainObject extends StringIdentifiedEntity {
    private static final long serialVersionUID = 6355271224319563233L;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "updated_by")
    private String updeatedBy;

    @Column(name = "updated_time")
    private Date updatedTime;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdeatedBy() {
        return updeatedBy;
    }

    public void setUpdeatedBy(String updeatedBy) {
        this.updeatedBy = updeatedBy;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public static void main(String[] args) {
        Integer a = new Integer(12);
        System.out.println(a == 12);
    }
}
