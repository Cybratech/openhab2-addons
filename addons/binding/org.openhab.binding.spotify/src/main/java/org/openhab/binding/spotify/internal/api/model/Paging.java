/**
 * Copyright (c) 2010-2018 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.spotify.internal.api.model;

import java.util.List;

/**
 * Spotify Web Api generic paging object class.
 *
 * @author Hilbrand Bouwkamp - Initial contribution
 */
public class Paging<T> {
    List<T> items;

    public List<T> getItems() {
        return items;
    }
}
