package org.brijframework.listener;

import org.brijframework.context.Context;

public interface Listener {

	public void initContext(Context context);

	public void actionPerformed(Context context);

	public void destroyedContext(Context context);
}
