package bootnative;

import java.time.Instant;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "todos")
public class Todo {
    @Id
    @GeneratedValue
    public UUID id;

    @Column
    public String title;

    @Column
    public Boolean done;

    @Column(name = "created_at", nullable = false, updatable = false)
    @CreationTimestamp
    @JsonIgnore
    public Instant createdAt;

    @Column(name = "updated_at", nullable = false)
    @UpdateTimestamp
    @JsonIgnore
    public Instant updatedAt;

}
