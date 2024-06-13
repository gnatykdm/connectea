package org.connect.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@Table(name = "users")
public class User  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer userId;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "register_date", nullable = false)
    private LocalDate registerDate;

    @OneToMany(mappedBy = "sender", cascade = CascadeType.ALL)
    private Set<Message> sentMessages;

    @OneToMany(mappedBy = "receiver", cascade = CascadeType.ALL)
    private Set<Message> receivedMessages;

    @OneToMany(mappedBy = "user1", cascade = CascadeType.ALL)
    private Set<ChatRoom> chatRooms1;

    @OneToMany(mappedBy = "user2", cascade = CascadeType.ALL)
    private Set<ChatRoom> chatRooms2;

    public User(String username, String email, String password, LocalDate registerDate) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.registerDate = registerDate;
    }
}