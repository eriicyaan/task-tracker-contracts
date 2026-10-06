package com.tasktracker.kafka.rpc.summarization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class SchedulerSummarizationResponse {
    private UUID userId;
    private byte[] resource;

}
