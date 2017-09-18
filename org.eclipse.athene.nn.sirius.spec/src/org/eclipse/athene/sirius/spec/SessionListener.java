package org.eclipse.athene.sirius.spec;

import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManagerListener;

public class SessionListener extends SessionManagerListener.Stub {

	@Override
	public void notifyAddSession(Session newSession) {
		newSession.getEventBroker().addLocalTrigger(MoveInOutPutsInCommonTrigger.IS_GMF_NODE_ATTACHMENT,
				new MoveInOutPutsInCommonTrigger(newSession.getTransactionalEditingDomain()));
	}

}