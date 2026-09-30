package com.kafka.rpc.summarization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.core.io.InputStreamResource;

import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class SchedulerSummarizationResponse {
    private UUID userId;
    private InputStreamResource resource;

}
