package patterns.strategy;

import models.Emergency;

public interface StrategyPriority {
int calculatePriority(Emergency emergency);
}
