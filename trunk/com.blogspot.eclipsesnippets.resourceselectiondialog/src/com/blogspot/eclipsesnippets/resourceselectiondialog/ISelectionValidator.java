/**
 * 
 */
package com.blogspot.eclipsesnippets.resourceselectiondialog;

import org.eclipse.core.resources.IResource;

public interface ISelectionValidator {
	public boolean isValid(IResource resource);
}