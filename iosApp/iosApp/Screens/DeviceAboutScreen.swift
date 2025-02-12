//
//  DeviceAboutScreen.swift
//  iosApp
//
//  Created by BS01279 on 11/2/25.
//  Copyright © 2025 orgName. All rights reserved.
//

import SwiftUI

struct DeviceAboutScreen: View {
    @Environment(\.dismiss)
    private var dismiss
    
    var body: some View {
        NavigationStack {
            AboutListView()
                .navigationTitle("About Device")
                .toolbar {
                    ToolbarItem(placement: .primaryAction) {
                        Button {
                            dismiss()
                        } label: {
                            Text("Done")
                                .bold()
                        }
                    }
                }
        }
    }
}

#Preview {
    DeviceAboutScreen()
}
