/*******************************************************************************
 * Copyright (c) 2019 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.example.fowlerdsl.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.example.fowlerdsl.ui.editor.StatemachineEditor;
import org.eclipse.xtext.example.fowlerdsl.ui.folding.StatemachineFoldingRegionProvider;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.folding.IFoldingRegionProvider;

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
public class StatemachineUiModule extends AbstractStatemachineUiModule {

	public StatemachineUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	public Class<? extends IFoldingRegionProvider> bindIFoldingRegionProvider() {
		return StatemachineFoldingRegionProvider.class;
	}

	public Class<? extends XtextEditor> bindXtextEditor() {
		return StatemachineEditor.class;
	}
}
