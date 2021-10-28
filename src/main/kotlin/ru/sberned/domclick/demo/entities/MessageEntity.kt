package ru.sberned.domclick.demo.entities

import javax.persistence.*

@Entity
@Table(name = "message")
data class MessageEntity (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    @Column(name = "message", unique = false, nullable = false)
    val message: String
)