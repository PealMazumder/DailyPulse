//
//  DeviceAboutScreen.swift
//  iosApp
//
//  Created by BS01279 on 11/2/25.
//  Copyright © 2025 orgName. All rights reserved.
//

import SwiftUI

struct DeviceAboutScreen: View {
    var body: some View {
        NavigationStack{
            AboutListView().navigationTitle("About Device")
        }
    }
}

#Preview {
    DeviceAboutScreen()
}
