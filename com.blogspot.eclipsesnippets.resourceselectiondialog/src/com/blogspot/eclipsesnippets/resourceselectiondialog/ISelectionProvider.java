package com.blogspot.eclipsesnippets.resourceselectiondialog;

import org.eclipse.core.resources.IContainer;

interface ISelectionProvider extends ISelectionValidator {
	public IContainer getRoot();
}
