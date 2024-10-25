<template>

    <v-data-table
        :headers="headers"
        :items="filePage"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'FilePageView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "fileId", value: "fileId" },
                { text: "fileSize", value: "fileSize" },
                { text: "fileName", value: "fileName" },
                { text: "indexStatus", value: "indexStatus" },
                { text: "uploadDate", value: "uploadDate" },
                { text: "userId", value: "userId" },
                { text: "uploadStatus", value: "uploadStatus" },
            ],
            filePage : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/filePages'))

            temp.data._embedded.filePages.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.filePage = temp.data._embedded.filePages;
        },
        methods: {
        }
    }
</script>

