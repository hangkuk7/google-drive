
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import DriveDriveStoreManager from "./components/listers/DriveDriveStoreCards"
import DriveDriveStoreDetail from "./components/listers/DriveDriveStoreDetail"

import IndexerIndexerStoreManager from "./components/listers/IndexerIndexerStoreCards"
import IndexerIndexerStoreDetail from "./components/listers/IndexerIndexerStoreDetail"

import VedioProcessingVideoStoreManager from "./components/listers/VedioProcessingVideoStoreCards"
import VedioProcessingVideoStoreDetail from "./components/listers/VedioProcessingVideoStoreDetail"

import NotificationNotificationStoreManager from "./components/listers/NotificationNotificationStoreCards"
import NotificationNotificationStoreDetail from "./components/listers/NotificationNotificationStoreDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/drives/driveStores',
                name: 'DriveDriveStoreManager',
                component: DriveDriveStoreManager
            },
            {
                path: '/drives/driveStores/:id',
                name: 'DriveDriveStoreDetail',
                component: DriveDriveStoreDetail
            },

            {
                path: '/indexers/indexerStores',
                name: 'IndexerIndexerStoreManager',
                component: IndexerIndexerStoreManager
            },
            {
                path: '/indexers/indexerStores/:id',
                name: 'IndexerIndexerStoreDetail',
                component: IndexerIndexerStoreDetail
            },

            {
                path: '/vedioProcessings/videoStores',
                name: 'VedioProcessingVideoStoreManager',
                component: VedioProcessingVideoStoreManager
            },
            {
                path: '/vedioProcessings/videoStores/:id',
                name: 'VedioProcessingVideoStoreDetail',
                component: VedioProcessingVideoStoreDetail
            },

            {
                path: '/notifications/notificationStores',
                name: 'NotificationNotificationStoreManager',
                component: NotificationNotificationStoreManager
            },
            {
                path: '/notifications/notificationStores/:id',
                name: 'NotificationNotificationStoreDetail',
                component: NotificationNotificationStoreDetail
            },




    ]
})
