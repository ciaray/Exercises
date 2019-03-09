// import the application widgets
import org.eclipse.swt.widgets.Display; // creates new window
import org.eclipse.swt.widgets.Shell; // configures the inside of the window
import org.eclipse.swt.widgets.Button; // button tools
import org.eclipse.swt.SWT; // button styles
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionAdapter;

public class HelloWorldSWT {
	

	public static void main(String[] args) {
		
		// display set up
		Display display = new Display();
		
		// shell set up
		Shell shell = new Shell(display);
		shell.setText("Hello world!");
		shell.setSize(250, 200);
		shell.open();
		
		// button set up
		Button button = new Button(shell, SWT.PUSH);
		button.setText("Hi!");
		button.setLocation(0, 0);
		button.setSize(100, 20);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.getDisplay().dispose();
				System.exit(0);
				
			}
			
		});
		
		
		// event main loop
		while(!shell.isDisposed()) {
			if(!display.readAndDispatch()) display.sleep();	
		}
		
		display.dispose();
		
	

	}

}
