package com.liferay.docs.guestbook.bus;

import com.liferay.portal.kernel.messaging.Destination;
import com.liferay.portal.kernel.messaging.DestinationConfiguration;
import com.liferay.portal.kernel.messaging.DestinationFactory;
import com.liferay.portal.kernel.util.HashMapDictionary;

import java.util.Dictionary;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true, 
		service = MyMessagingConfigurator.class
)
public class MyMessagingConfigurator {
	
	private static int _MAXIMUM_QUEUE_SIZE = 10;
	
	@Activate
	protected void activate(BundleContext bundleContext) {
		
		_bundleContext = bundleContext;
		
		DestinationConfiguration destinationConfiguration = new DestinationConfiguration(DestinationConfiguration.DESTINATION_TYPE_PARALLEL, "myDestinationName");
		
		/*destinationConfiguration.setMaximumQueueSize(_MAXIMUM_QUEUE_SIZE);
		
		RejectedExecutionHandler rejectedExecutionHandler = new CallerRunsPolicy() {
			@Override
			public void rejectedExecution(
					Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
						super.rejectedExecution(runnable, threadPoolExecutor);
					}
			};
		destinationConfiguration.setRejectedExecutionHandler(rejectedExecutionHandler);*/
		
		Destination destination = _destinationFactory.createDestination(destinationConfiguration);
		
		Dictionary<String, Object> properties = new HashMapDictionary<>();
		
		properties.put("destination.name", destination.getName());
		
		ServiceRegistration<Destination> serviceRegistration = _bundleContext.registerService(Destination.class, destination, properties);
		
		_serviceRegistration = serviceRegistration;
	}

	@Deactivate
	protected void deactivate() {
		Destination destination = _bundleContext.getService(_serviceRegistration.getReference());
		_serviceRegistration.unregister();
		destination.destroy();
	}

	private ServiceRegistration<Destination> _serviceRegistration;
	
	private BundleContext _bundleContext;
	
	private DestinationFactory _destinationFactory;

	@Reference(unbind="-")
	public void set_destinationFactory(DestinationFactory _destinationFactory) {
		this._destinationFactory = _destinationFactory;
	}
	
	
}
