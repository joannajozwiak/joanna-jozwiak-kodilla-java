package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface AvailabiltyService {
    boolean isAvailable (User user, LocalDate timeOfOrder, String product);
}
