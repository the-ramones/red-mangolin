package sp.model;
// Generated Jul 29, 2013 9:22:08 PM by Hibernate Tools 3.2.1.GA

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * RegisterId generated by hbm2java
 */
@Embeddable
public class RegisterId implements java.io.Serializable {

    private long id;
    private int userId;
    private int opId;

    public RegisterId() {
    }

    public RegisterId(long id, int userId, int opId) {
        this.id = id;
        this.userId = userId;
        this.opId = opId;
    }

    @Column(name = "id", nullable = false)
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(name = "op_id", nullable = false)
    public int getOpId() {
        return this.opId;
    }

    public void setOpId(int opId) {
        this.opId = opId;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }
        if ((other == null)) {
            return false;
        }
        if (!(other instanceof RegisterId)) {
            return false;
        }
        RegisterId castOther = (RegisterId) other;

        return (this.getId() == castOther.getId())
                && (this.getUserId() == castOther.getUserId())
                && (this.getOpId() == castOther.getOpId());
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (int) this.getId();
        result = 37 * result + this.getUserId();
        result = 37 * result + this.getOpId();
        return result;
    }
}
