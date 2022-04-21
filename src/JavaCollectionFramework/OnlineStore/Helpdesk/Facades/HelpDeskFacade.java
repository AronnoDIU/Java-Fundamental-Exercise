package JavaCollectionFramework.OnlineStore.Helpdesk.Facades;

import JavaCollectionFramework.OnlineStore.Helpdesk.Enteties.SupportTicket;

public interface HelpDeskFacade {

	void addNewSupportTicket(SupportTicket supportTicket);

	SupportTicket getNextSupportTicket();

	/**
	 * @return amount of tickets that are not processed
	 */
	int getNumberOfTickets();

}
