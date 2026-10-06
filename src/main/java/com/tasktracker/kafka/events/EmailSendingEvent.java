package com.tasktracker.kafka.events;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmailSendingEvent {
    private UUID id;
    private String username;
    private EventType eventType;
    private byte[] report;
}
