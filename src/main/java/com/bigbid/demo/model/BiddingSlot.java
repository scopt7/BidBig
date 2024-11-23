package com.bigbid.demo.model;

import java.time.LocalDateTime;

public class BiddingSlot {
    private Long slotId;
    private Long itemId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Long winningBidId;
    private boolean isActive;
}
