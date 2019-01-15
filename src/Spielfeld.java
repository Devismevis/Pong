import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;

public class Spielfeld extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public Spielfeld(Composite parent, int style) {
		super(parent, style);
		
		Canvas canvas = new Canvas(this, SWT.BORDER);
		canvas.setBackground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		canvas.setBounds(0, 0, 450, 300);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
