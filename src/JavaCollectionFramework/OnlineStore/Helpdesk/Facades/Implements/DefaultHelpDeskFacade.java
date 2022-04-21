package JavaCollectionFramework.OnlineStore.Helpdesk.Facades.Implements;

import java.util.PriorityQueue;
import java.util.Queue;

import JavaCollectionFramework.OnlineStore.Helpdesk.Enteties.SupportTicket;
import JavaCollectionFramework.OnlineStore.Helpdesk.Facades.HelpDeskFacade;
import JavaCollectionFramework.OnlineStore.Helpdesk.Utils.CustomSupportTicketsComparator;



public class DefaultHelpDeskFacade implements HelpDeskFacade {

private Queue<SupportTicket> tickets;
	
	{
		tickets = new PriorityQueue<>(new CustomSupportTicketsComparator());
	}

	@Override
	public void addNewSupportTicket(SupportTicket supportTicket) {
		tickets.offer(supportTicket);
	}

	@Override
	public SupportTicket getNextSupportTicket() {
		return tickets.poll();
	}

	@Override
	public int getNumberOfTickets() {
		return tickets.size();
	}

}