<template>

    <v-card outlined>
        <v-card-title>
            FilePage # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <String label="FileId" v-model="item.fileId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="FileSize" v-model="item.fileSize" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="FileName" v-model="item.fileName" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="IndexStatus" v-model="item.indexStatus" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Date label="UploadDate" v-model="item.uploadDate" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="UserId" v-model="item.userId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="UploadStatus" v-model="item.uploadStatus" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'FilePageViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/filePages/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

