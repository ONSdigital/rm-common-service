package uk.gov.ons.ctp.common.events;
/**
 * 
 * Created by Chris hardman 25/09/2017
 *
 */
public interface EventExchange {

  /**
   * send sample to collection exercise queue
   * @param sampleUnit to be sent
   */
   String send(String event);
}
