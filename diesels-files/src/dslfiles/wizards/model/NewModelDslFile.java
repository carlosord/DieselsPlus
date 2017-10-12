package dslfiles.wizards.model;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

/**
 * This is a sample new wizard. Its role is to create a new file resource in the
 * provided container. If the container resource (a folder or a project) is
 * selected in the workspace when the wizard is opened, it will accept it as the
 * target container. The wizard creates one file with the extension "model". If
 * a sample multi-page editor (also available as a template) is registered for
 * the same extension, it will be able to open it.
 */

public class NewModelDslFile extends Wizard implements INewWizard {

    private IStructuredSelection selection;
    private NewModelDslFilePage newModelDslFilePage;

    public NewModelDslFile() {
        setWindowTitle("Diesels DSL File");
    }

    @Override
    public void addPages() {
        newModelDslFilePage = new NewModelDslFilePage(selection);
        addPage(newModelDslFilePage);
    }

    @Override
    public boolean performFinish() {
        final IFile file = newModelDslFilePage.createNewFile();
        openFileAtFinish(file);

        return file != null;
    }

    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        this.selection = selection;
    }

    private void openFileAtFinish(final IFile file) {
        getShell().getDisplay().asyncExec(new Runnable() {
            public void run() {
                IWorkbenchPage page = PlatformUI.getWorkbench()
                        .getActiveWorkbenchWindow().getActivePage();
                try {
                    IDE.openEditor(page, file, true);
                } catch (PartInitException e) {
                    System.err
                            .println("Could not open " + file.getName() + ".");
                }
            }
        });
    }

}