package dslfiles.wizards.dto;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (dto).
 */

public class NewDtoDslFilePage extends WizardNewFileCreationPage {

    /**
     * Constructor for Dto DSL wizard Page.
     *
     * @param selection
     *            folder which is selected
     */
    public NewDtoDslFilePage(IStructuredSelection selection) {
        super("NewDtoDslFilePage", selection);
        setTitle("New Dto DSL file");
        setDescription(
                "Create a new file with *.dto extension to Diesels Tool.");
        setFileExtension("dto");
        setFileName("dto_dsl");
    }

    @Override
    protected InputStream getInitialContents() {
        StringBuilder contents = new StringBuilder();
        contents.append("/*\n");
        contents.append(
                " * Dto DSL File. This DSL contains DTOs specification\n");
        contents.append(" */");

        return new ByteArrayInputStream(contents.toString().getBytes());
    }

}