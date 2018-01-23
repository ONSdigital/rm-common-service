package uk.gov.ons.ctp.common.state;

import java.util.Map;

public class QueueAwareStateTransitionManager<S, E> extends BasicStateTransitionManager<S, E> {
    /**
     * Construct the instance with a provided map of transitions
     *
     * @param transitionMap the transitions
     */
    public QueueAwareStateTransitionManager(Map<S, Map<E, S>> transitionMap, String exchangeName, boolean createExchange) {
        super(transitionMap);
    }
}
