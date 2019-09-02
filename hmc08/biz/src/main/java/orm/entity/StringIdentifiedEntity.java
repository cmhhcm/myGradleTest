package orm.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Author:meice Huang
 * Time: 2019-08-27 13:58
 */
@MappedSuperclass
public abstract class StringIdentifiedEntity  implements Serializable {
    private static final long serialVersionUID = -6748117443334367214L;

    @Id
    @Column(name = "id")
    protected String id;

    @Column(name = "version")
    long version;
}
