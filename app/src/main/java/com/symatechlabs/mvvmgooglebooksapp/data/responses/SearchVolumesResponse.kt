package com.symatechlabs.mvvmgooglebooksapp.data.responses

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SearchVolumes(
    val kind: String,
    val totalItems: Long,
    val items: List<Item>,
)

@JsonClass(generateAdapter = true)
data class Item(
    val kind: String,
    val id: String,
    val etag: String,
    val selfLink: String,
    val volumeInfo: VolumeInfo,
    val saleInfo: SaleInfo,
    val accessInfo: AccessInfo,
    val searchInfo: SearchInfo,
)

@JsonClass(generateAdapter = true)
data class VolumeInfo(
    val title: String,
    val subtitle: String,
    val authors: List<String>,
    val publisher: String,
    val publishedDate: String,
    val description: String,
    val industryIdentifiers: List<IndustryIdentifier>,
    val readingModes: ReadingModes,
    val pageCount: Long,
    val printType: String,
    val categories: List<String>,
    val maturityRating: String,
    val allowAnonLogging: Boolean,
    val contentVersion: String,
    val panelizationSummary: PanelizationSummary,
    val imageLinks: ImageLinks,
    val language: String,
    val previewLink: String,
    val infoLink: String,
    val canonicalVolumeLink: String,
    val averageRating: Long?,
    val ratingsCount: Long?,
)

@JsonClass(generateAdapter = true)
data class IndustryIdentifier(
    val type: String,
    val identifier: String,
)

@JsonClass(generateAdapter = true)
data class ReadingModes(
    val text: Boolean,
    val image: Boolean,
)

@JsonClass(generateAdapter = true)
data class PanelizationSummary(
    val containsEpubBubbles: Boolean,
    val containsImageBubbles: Boolean,
)

@JsonClass(generateAdapter = true)
data class ImageLinks(
    val smallThumbnail: String,
    val thumbnail: String,
)

@JsonClass(generateAdapter = true)
data class SaleInfo(
    val country: String,
    val saleability: String,
    val isEbook: Boolean,
    val listPrice: ListPrice?,
    val retailPrice: RetailPrice?,
    val buyLink: String?,
    val offers: List<Offer>?,
)

@JsonClass(generateAdapter = true)
data class ListPrice(
    val amount: Double,
    val currencyCode: String,
)

@JsonClass(generateAdapter = true)
data class RetailPrice(
    val amount: Double,
    val currencyCode: String,
)

@JsonClass(generateAdapter = true)
data class Offer(
    val finskyOfferType: Long,
    val listPrice: ListPrice2,
    val retailPrice: RetailPrice2,
    val giftable: Boolean,
)

@JsonClass(generateAdapter = true)
data class ListPrice2(
    val amountInMicros: Long,
    val currencyCode: String,
)

@JsonClass(generateAdapter = true)
data class RetailPrice2(
    val amountInMicros: Long,
    val currencyCode: String,
)

@JsonClass(generateAdapter = true)
data class AccessInfo(
    val country: String,
    val viewability: String,
    val embeddable: Boolean,
    val publicDomain: Boolean,
    val textToSpeechPermission: String,
    val epub: Epub,
    val pdf: Pdf,
    val webReaderLink: String,
    val accessViewStatus: String,
    val quoteSharingAllowed: Boolean,
)

@JsonClass(generateAdapter = true)
data class Epub(
    val isAvailable: Boolean,
    val acsTokenLink: String?,
)

@JsonClass(generateAdapter = true)
data class Pdf(
    val isAvailable: Boolean,
    val acsTokenLink: String?,
)

@JsonClass(generateAdapter = true)
data class SearchInfo(
    val textSnippet: String,
)
