package ru.sberned.domclick.demo.repositories

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.sberned.domclick.demo.entities.MessageEntity

@Repository
interface MessageRepository : JpaRepository<MessageEntity, Long>
